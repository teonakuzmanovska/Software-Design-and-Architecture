## Conceptual Architecture

### Functional Requirements

1. The web application shall **keep .csv tables** for schools, **universities**, and **libraries** in Skopje. 
2. The web application shall **provide a list** of school and university names on the client side. 
3. The web application shall have a **selection** function for the provided list of schools and universities in Skopje. 
4. The web application shall have a **search** function for the list of **schools** and **universities** in Skopje. 
5. The web application shall **provide a map** of Skopje. 
6. The web application shall **display a map** with libraries in the nearest **locations** to the selected school/university. 
7. The web application shall have a **calculation** function for **distance** between a school/university and libraries. 
8. The web application shall **display information** about the **working hours** of the provided libraries.

### Non-Functional Requirements

1. The web application shall **run on different operating systems** (Windows, macOS, Linux) and **support most browsers** such as Chrome, Firefox, and Safari. 
2. The web application shall **respect privacy policies**. 
3. The **search** function shall not take more than 10 seconds. 
4. The **calculation** function shall not take more than 10 seconds. 
5. The **precision** of the calculation function shall have an accuracy of 98%. 
6. The web application shall enable novice users to perform search and selection functions in less than 1 minute.

| Data         | Function     | Stakeholder | Abstract Concept                        |   |
| ------------ | ------------ | ----------- | --------------------------------------- | - |
| `.csv` table | Provide list | User        | Display information about working hours |   |
| List         | Select       |             |                                         |   |
| Map          | Search       |             |                                         |   |
| Distance     | Display      |             |                                         |   |
| Location     | Calculate    |             |                                         |   |
| School       |              |             |                                         |   |
| University   |              |             |                                         |   |
| Libraries    |              |             |                                         | } |

### Conceptual View

![Conceptual Architecture.jpg](01%20UML%20diagrams/conceptual_diagram.jpg)


## Architectural Styles

#### Data-Centered Architecture

The communication between the centralized data store and the clients follows the repository subtype.
The system uses a centralized database stored in .csv format.

#### Resource-Oriented Architecture (ROA)

Data is manipulated using the HTTP protocol.

#### Virtual Machine Architecture

The system runs on the Java Virtual Machine (JVM).

#### Interpreter

The system uses:
- Command-line (cmd) scripts
- JavaScript

#### 3-Tier Architecture

The system follows a 3-tier architecture:
- Presentation Layer – Client-side interface
- Business Logic Layer – Java backend
- Data Layer – .csv database

#### Notification Architecture

The system sends events to interested components.

#### Client–Server Architecture

Loose coupling between client and server.
Vertical scaling is supported

#### MVC (Model–View–Controller)

The system uses the Spring Boot framework.
The Model communicates with the data layer. The View represents the client interface. The Controller handles request processing

#### Heterogeneous Architecture

The system includes a search engine component.

## Implementation Architecture

### Sequence diagram

![sequence_diagram_hw2.jpg](01%20UML%20diagrams/sequence_diagram.jpg)

## Execution Architecture

### Component Diagram

![component_diagram.png](01%20UML%20diagrams/execution_diagram.png)

## Mockups

![mockup1.png](02%20GUI%20Mockups/mockup1.png)

![mockup2.png](02%20GUI%20Mockups/mockup2.png)
