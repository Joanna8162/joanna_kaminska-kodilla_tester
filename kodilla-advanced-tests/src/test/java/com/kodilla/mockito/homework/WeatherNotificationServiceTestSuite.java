package com.kodilla.mockito.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Set;

class WeatherNotificationServiceTest {

    WeatherNotificationService service;
    Notification notification;
    User user1;
    User user2;
    User user3;
    Location location1;
    Location location2;

    @BeforeEach
    public void setUp() {
        service = new WeatherNotificationService();
        notification = Mockito.mock(Notification.class);
        user1 = Mockito.mock(User.class);
        user2 = Mockito.mock(User.class);
        user3 = Mockito.mock(User.class);
        location1 = Mockito.mock(Location.class);
        location2 = Mockito.mock(Location.class);

        service.addUserToSubscriptionList(user1, location1);
        service.addUserToSubscriptionList(user2, location2);
    }

    @Test
    public void shouldAddUserToLocation() {
        service.sendNotificationToLocation(notification, location1);

        Mockito.verify(user1).receive(notification);
    }

    @Test
    public void shouldRemoveUserFromLocation() {
        service.removeUserFromSubscriptionList(user1, location1);
        service.sendNotificationToLocation(notification, location1);

        Mockito.verify(user1, Mockito.never()).receive(notification);
    }

    @Test
    public void shouldRemoveUserFromAllLocations() {
        service.addUserToSubscriptionList(user1, location2);

        service.removeUserFromAllSubscriptions(user1);

        service.sendNotificationToLocation(notification, location1);
        service.sendNotificationToLocation(notification, location2);

        Mockito.verify(user1, Mockito.never()).receive(notification);
    }

    @Test
    public void shouldSendNotificationToAllUniqueUsers() {
        service.addUserToSubscriptionList(user2, location1);
        service.addUserToSubscriptionList(user1, location2); // user1 zapisany 2 razy

        service.sendNotificationToAllUsers(notification);

        Mockito.verify(user1, Mockito.times(1)).receive(notification);
        Mockito.verify(user2, Mockito.times(1)).receive(notification);
    }

    @Test
    public void shouldSendNotificationOnlyToUsersInGivenLocation() {
        service.sendNotificationToLocation(notification, location1);

        Mockito.verify(user1, Mockito.times(1)).receive(notification);
        Mockito.verify(user2, Mockito.never()).receive(notification);
    }

    @Test
    public void shouldRemoveLocation() {
        service.removeLocation(location1);

        service.sendNotificationToLocation(notification, location1);

        Mockito.verify(user1, Mockito.never()).receive(notification);
    }
}
