# Check-Internet-Connection
This project is to develop a .jar library to check the internet availability.

#### Features
1) Check Internet Connection Availability (Default, For Specific IP Address)

#### Methods
1) >.isAvailable();
2) >.isAvailable(hostName, portNumber);

#### How to Use

1) Download the .jar file and add it to your project
2) Import Library:
   
   ```java
   
   import com.Internet;
   
   ```

3) Use Methods: </br></br>
    i) .isAvailable() </br>
    > This method can be used to determine whether have the internet connection or not. In default try to establish a connection to the Google server for this.
    
   ```java
   
   boolean available = Internet.isAvailable();
   
   ```
    ii) .isAvailable() </br>
    > This method can be used to determine whether have the internet connection or not. Can be used to check with a specific server.
    
   ```java
   
   boolean available = Internet.isAvailable(hostName, portNumber);
   
   ```

  #### Outputs:
  1) true -> Connection available
  2) false -> No Connection

#### Example Code:

```java

import com.Internet;

public class Test {

    public static void main(String[] args) {
        
        boolean available = Internet.isAvailable(hostName, 0);
        boolean available1 = Internet.isAvailable();

    }
    
}

```
 
