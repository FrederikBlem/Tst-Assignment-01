package kata;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class QueueOfPeopleTest {

    // RED: First made this fail by returning -1.0
    // GREEN: Then made it green by returning 0

    @Test
    public void totalOfEmptyQueue(){
        // Arrange
        QueueOfPeople queueOfPeople = new QueueOfPeople(Arrays.asList());
        // Act
        // Assert
        assertEquals(0.0, queueOfPeople.getAmountOfPeopleWaiting(), 0.0);
    }

    // Continue the development by creating another test that will fail etc.

    // In this case I first had to create the Person class and change the constructor
    // of QueueOfPeople to accept a list of Person objects.
    // After that the test call above had to send an empty list.
    // RED: Following that the test below will fail because the getAmountOfPeopleWaiting method always returned 0.
    // GREEN: Create a field for the peopleWaiting list and return the length of it. (

    @Test
    public void totalOfSinglePersonWaiting(){
        // Arrange
        QueueOfPeople queueOfPeople = new QueueOfPeople(Arrays.asList(new Person("Dude McGuyson")));
        // Act
        // Assert
        assertEquals(1.0, queueOfPeople.getAmountOfPeopleWaiting(), 0.0);
    }

    // You could continue development of this by making a test asking for names of people waiting etc.
}
