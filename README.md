# MovieProcessCentric

Identification:  
NAME: Cheema Danish Asghar  
EMAIL: danishasghar.cheema@studenti.unitn.it  

Client Code Done by:  
NAME: Main muhammad faheem - Jan  
EMAIL:main.jan@unitn.it  

Server heroku ULR:  
Server Git ripo:  

Client Git riop:  

## Architecture : 
It has the following directories.  
* adopter/recombee/soap : it has many different java files and their execution files.  
   * `Evaluation.java` has following attributes. this class evaluates items.    
         
     |itemId|rating|dateTime|userId|       
     |------|------|--------|------|      
   
   * `ItemObject.java` This class tells us about the item i.e its id,type and location.
       
     |itemId|Type|Location|           
     |------|----|--------|   
     
   * `ObjectFactory.java` This object contains factory methods for each Java content interface and Java element interface.  
   * `RecombeeDBType.java` Its basic function is to search the specified value and then return that database i.e movie,food.     
* business/soap :It has all the business classes and their execution files.Some of the important classes are following.  
   * `AddNewRating.java` adds new rating to items using this class.   
   *  `AddNewUser.java`  it adds new user.  
   *  `BusinessImplService.java`  This class implements the business interface.    
   *  `BusinessInterface.java`  This is the business interfaces which has many business methods.  
   *  `GetAllItem.java`  this class gets us all the items.    
   *  `GetAllUser.java`  gets all the users.  
   *  `GetFoodTypes.java`  gets food type.  
   *  `GetItemsByType.java` it gets an item by given its type.    
   *  `GetMovieGens.java	` it gets us movie generes.  
   *  `GetPersonByToken.java`	 it gets person by token.
   *  `GetRecommendations.java`	it gets the recommendat  
   *  `GetUser.java`	it gets User.    
   *  `GetUserRatings.java`	it gets all the ratings  
   *  `ObjectFactory.java`	    
   *  `UpdateUser.java	`  
     
  
* data/local/soap  
* process/movie/rest : It has two packages 
  1) model : it has two classes  
    **BusinessService.java  
        
        * Method 1 `getPersonByU(String userName)` it gets person by its username.      
        * Method 2 `getMovieRecom(Person person, int quantity)` it recommends movies to the person.  
        * Method 3 `addMovieRating(Person person, Evaluation rating)` it gives rating to the item by person.    
        * Method 4 `getAllMovie()` it returns the list of all the movies.    
        * Method 5 `getUserRatings(Person u)` it returns the list of all the ratings made by person u.  
        * Method 6 `getMovieByGen(String movieGen)` this method returns the list of all the movies of the specific genere.    
        * Method 7 `getPersonByToken(String token)` it returns person by its token.    
        * Method 8 `getMovieGens()` it returns all the genere of movies.   
        * Method 9 `addUserRatings(Person u, double d, String itemId)`  it adds ratings to items by specific user.  
  2) resources  
## Execution:    
1: clone or download the code from server git repo.    
2: run following commands on command line     
```
git init  
git add .  
git commit -am "initial commit"  
heroku create NAME-OF-HEROKU-APP  
git push heroku master   

```
in my project NAME-OF-HEROKU-APP="movieprocess"  
