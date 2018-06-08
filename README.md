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
       - `Evaluation.java` has following attributes. this class evaluates items.    
         
     |itemId|rating|dateTime|userId|       
     |------|------|--------|------|      
     
     - `ItemObject.java` This class tells us about the item i.e its id,type and location.
       
     |itemId|Type|Location|           
     |------|----|--------|   
       
* business/soap  
* data/local/soap  
* process/movie/rest  

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
