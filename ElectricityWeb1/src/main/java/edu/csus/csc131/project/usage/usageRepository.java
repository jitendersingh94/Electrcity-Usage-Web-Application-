package edu.csus.csc131.project.usage;

import org.springframework.stereotype.Component;

@Component

public interface usageRepository extends JpaRepository<User, long > {

}
