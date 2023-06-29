package day33_abstraction;
import day32_finalKeyword.personTask.Person;                               //Even for the inheritance we have to import
import java.time.LocalDate;

public final class CydeoDevStudent extends Person {

    private final String id;
    private String batchName;
    private int batchNumber;

    public static final String programmingLanguage;

    public CydeoDevStudent(String name, char gender,LocalDate dateOfBirth,String id, String batchName, int batchNumber){
        super(name, gender, dateOfBirth);
        if (getAge() < 18) { // if age is set to less than 18
            System.err.println("Cydeo Developer student must be at least 18 years old");
            System.exit(1);
        }
        this.id = id;
        setBatchName(batchName);
        setBatchNumber(batchNumber);
    }
//----static block------------------------------------------------------------------------------------------------------
        static {
         programmingLanguage = "Java";
        }
//----getters & setters-------------------------------------------------------------------------------------------------

    public String getId() {
        return id;
    }

    public String getBatchName() {
        return batchName;
    }

    public int getBatchNumber() {
        return batchNumber;
    }

    public void setBatchName(String batchName) {
        if (batchName.equalsIgnoreCase("zero to hero") || batchName.equalsIgnoreCase("alumni dev")) {
            this.batchName = batchName;
        } else { // otherwise: if the batch name is invalid
            System.err.println("Invalid batch name: " + batchName + " \nNo such a batch at Cydeo");
            System.exit(1);
        }
    }

    public void setBatchNumber(int batchNumber) {

        if (batchNumber <= 0) {
            System.err.println("Invalid batch number: " + batchNumber + "\nBatch number can not be negative or zero");
            System.exit(1);
        }

        this.batchNumber = batchNumber;
    }
//----common methods----------------------------------------------------------------------------------------------------
    @Override
    public void eat() {
        System.out.println(getName() + " is eating " + programmingLanguage);
    }

    @Override
    public void drink() {
        System.out.println(getName() + " is drinking " + programmingLanguage);
    }

    @Override
    public void sleep() {
        System.out.println(getName()+" does not need to sleep");
    }

    @Override
    public String toString() {
        return "CydeoDevStudent{" +
                "name='" + getName() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                ", dateOfBirth=" + getDateOfBirth() +
                ", id='" + id + '\'' +
                ", batchName='" + batchName + '\'' +
                ", batchNumber=" + batchNumber +
                '}';
    }

}
/*
Warmup tasks:
	1. Create a sub class of Person (from day32 package) named CydeoDevStudent (final)
			Extra Variables:
				id (final), batchName, batchNumber, programmingLanguage(static & final)

			Extra conditions:
					1. Age has to be at least 18 years old
					2. batchName can ONLY be set to "Zero to Hero" or "Alumni Dev"
					3. batchNumber can not be set to zero or negative

			Override the eat() & drink() methods and include the programmingLanguage variable in methods body

			Override the toString Method and include the id, batchName, batchNumber variables

Notlar since age is a final variable in the parent class we can not have a setter for it neither in the parent nor the
child so we have to give the conditions in the constructor. Important point about this is after we created the
constructor with both the parent's and the child's variables the constructor call of the parent with the super kw should
be placed in line 1 in the child's constructor. So therefore we have to place the condition after the constructor call
in the child's constructor.


 */