# 1) What technical/business constraints should the data storage component of the program architecture meet to fulfill the requirement described by the customer in paragraph «​Statistics» ​? So what kind of component(s) (listed in the lecture) will the architecture need?
## The technical constraint we have to respect says that we have to keep in the memory the reports of all the peacewatchers to make some statistics. We will use a stream in our architecture to do so because it contains all the reports from the beginning and we can access them easily. In terms of the CAP theorem, it has to be Partition Tolerant.


# 2) What business constraints should the architecture meet to fulfill the requirement describe in the paragraph «Alert»
## In a perfect world, we should watch 24/7 people and be able to send an alert containing all the data (to act quickly and efficiently). In terms of the CAP theorem, we should respect the Consistency and the Availability.


# 3) What mistake(s) from Peaceland can explain the failed attempt?
## Based on the two previous questions, the perfect architecture should be a CAP architecture, which is impossible. They probably took the option of AP, which allowed them to watch 24/7 and do some statistics, or CA, which means if an error occurs they can't do anything at all. To prevent these errors, we will use a CP architecture, allowing us to do some statistics and have an alert containing all the information and making sure this information is correct but with the possibility of not functioning 24/7.



# 4) Peaceland has likely forgotten some technical information in the report sent by the drone. In the future this information could help Peaceland make its peacewatchers much more efficient. Which information?
## We could add the current battery, to know when a peacewatcher will run out of electricity.


