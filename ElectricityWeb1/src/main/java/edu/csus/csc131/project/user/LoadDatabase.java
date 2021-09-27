package edu.csus.csc131.project.user;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*@Configuration
public class LoadDatabase {

	private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

	  @Bean
	  CommandLineRunner initDatabase(UserRepository userRepository, UsageRepository usageRepository) {

	      return args -> {
	          
	    	  userRepository.save(new User("Bilbo", "Baggins", "Hobbit-Hole 7", "Bag-End", "Shire", 95670));
	    	  userRepository.save(new User("Frodo", "Baggins", "Hobbit-Hole 7", "Bag-End", "Shire", 95670));
	    	  
	    	  userRepository.findAll().forEach(user -> log.info("Preloaded" + user));
	    	  
	    	  usageRepository.save(new User("MacBook Pro", Status.COMPLETED));
	          usageRepository.save(new User("iPhone", Status.IN_PROGRESS));
	          
	          usageRepository.findAll().forEach(order -> {
	              log.info("Preloaded " + usage);
	          });   	
	      
	      };
	  }

}
*/

@Configuration
class LoadDatabase {

  private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

  @Bean
  CommandLineRunner initDatabase(UserRepository repository, UsageRepository usageRepository) {

    return args -> {
    	repository.save(new User("Bilbo", "Baggins", "Hobbit-Hole 7", "Bag-End", "Shire", 95670));
    	repository.save(new User("Frodo", "Baggins", "Hobbit-Hole 7", "Bag-End", "Shire", 95670));
    	repository.findAll().forEach(user -> {
            log.info("Preloaded " + user);
         usageRepository.save(new User("MacBook Pro", Status.COMPLETED));
	     usageRepository.save(new User("iPhone", Status.IN_PROGRESS));
	          
	          usageRepository.findAll().forEach(order -> {
	              log.info("Preloaded " + usage);
        });      
    };
  }
}

