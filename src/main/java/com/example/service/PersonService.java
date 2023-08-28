package com.example.service;

import com.example.jpa.entity.Login;
import com.example.jpa.entity.Person;
import com.example.jpa.entity.TransactionHistory;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface PersonService {
    List<Person> getAllPersons();
    Person getPersonById(Long id);
//    boolean updatePerson(Long id, Person person);
    Person savePerson(Person person);
    Optional<Person> deleteUser(Long id);
//    ResponseEntity<List<Person>> getAllPersonsSortedAscTotalmoney();
//    ResponseEntity<List<Person>> getAllPersonsSortedDescTotalmoney();

    List<Person> getAllPersonsSorted(String sortOrder);

//    List<Person> getAllPersonsSortedByName(String sortOrder);
public List<TransactionHistory> getAllTransactionSortedByDate();

//    public List<UpdateHistory> getAllUpdateHistory();
    ResponseEntity<List<Person>> getPersonsInNegativeBalance();
//    void calculateAndSaveTotalMoney(double totalAmount, List<Long> selectedUserIds);
//    void calculateAndSaveTotalMoney1(double totalAmount, List<Long> selectedUserIds);
//    void calculateAndSaveTotalMoney2(double totalAmount, List<Long> selectedUserIds);
//    void calculateAndSaveTotalMoney3(double totalAmount, List<Long> selectedUserIds);
    void calculateAndSaveTotalMoney(double totalAmount, List<Long> selectedUserIds, String transactionType, String description);
    void calculateAndSaveTotalMoney1(double totalAmount, List<Long> selectedUserIds, String transactionType, String description);

    boolean existsByEmailOrPhoneNumber(String email, String phoneNumber);

    List<Person> searchByName(String name);

//    public void updatePerson(Long id, Person updatedPerson);

//    public Person updatePartialPerson(long id, Person updatedPerson);
    public Person updatePartialPerson(Long id, Person updatedPerson);

    boolean existsByEmail(String email);

    boolean existsByPhoneNumber(String phoneNumber);


    public void calculateAndSaveTotalMoney(double totalAmount, List<Long> selectedUserIds, List<Double> individualAmounts, String transactionType, String description);
    String md5Hash(String input);
    public Login registerUser(Login login);
    public Login loginUser(String userName, String password);
    public List<Login> getAllLoginInfor();
//    public void changePassword(String userName, String currentPassword, String newPassword);
//    public Login changePassword(Login login);
public Login changePassword(String userName, String currentPassword, String newPassword);
}
