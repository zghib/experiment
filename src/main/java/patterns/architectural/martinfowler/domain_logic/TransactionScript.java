package patterns.architectural.martinfowler.domain_logic;

/**
 Organizes business logic by procedures where each procedure handles a single request from the presentation <br/>
 ****************************<br/>
 * When to Use It
 The glory of Transaction Script is its simplicity. Organizing logic this way is natural for applications with only a small
 amount of logic, and it involves very little overhead either in performance or in understanding.
 As the business logic gets more complicated, however, it gets progressively harder to keep it in a well-designed
 state. One particular problem to watch for is its duplication between transactions. Since the whole point is to handle
 one transaction, any common code tends to be duplicated.
 */
public class TransactionScript {

}
