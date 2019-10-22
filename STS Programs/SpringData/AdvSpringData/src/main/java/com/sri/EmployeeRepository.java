package com.sri;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Integer> {

@Query("Select e from Employee e where dept=?1 and desig=?2")
List<Employee> findByDeptAndDesig(String dept,String desig);

@Query("Select e from Employee e where dept=?1 and desig=?2 and basic>?3")
List<Employee> findByBasic(String dept,String desig,int basic);

@Query("Select e from Employee e where dept=?1 and desig=?2 and basic<?3 and name like 'S%' ")
List<Employee> findByBasicandName(String dept,String desig,int basic);

@Query("Select e from Employee e where dept=?1 and desig=?2 order by basic desc ")
List<Employee> findBydeptanddesigwithdescbasic(String dept,String desig);

@Query("Select e from Employee e where dept=?1 and desig=?2 and basic<?3 and name like 'R%' order by basic desc ")
List<Employee> findByprgmer(String dept,String desig,int basic);
}
