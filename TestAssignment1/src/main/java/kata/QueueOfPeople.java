package kata;

import java.util.List;

public class QueueOfPeople {
    public final List<Person> peopleWaiting;

    public QueueOfPeople(List<Person> peopleWaiting){
        this.peopleWaiting = peopleWaiting;
    }

    public double getAmountOfPeopleWaiting(){
        return peopleWaiting.size();
    }
}
