public class Starter {
    public static void main(String[] args) {
        PhoneBook myBook = new PhoneBook("1");
        try {
            myBook.createRecord(new Record(2, "89996858709", "Селедцов Александр"));
            myBook.createRecord(new Record(3, "89994204053", "Дмытерко Дмитрий"));
            myBook.createRecord(new Record(4, "89501413066", "Ватутин Александр"));
            myBook.createRecord(new Record(1));
            myBook.createRecord(new Record(5, "89531413578"));

        } catch (PhoneNumberAlreadyExists e) {
            System.out.print(e);
        } catch (RecordNotValid e) {
            System.out.println(e);
        }
        System.out.println(myBook.getAllRecords());
        try {
            myBook.updateRecord(new Record(3, "89994204053", "Герман Тасс"));
            myBook.updateRecord(new Record(2, "Артур Чепарян"));
        } catch (PhoneNumberAlreadyExists e) {
            System.out.print(e);
        } catch (RecordNotValid e) {
            System.out.println(e);
        }
        System.out.println(myBook.getAllRecords());
        myBook.deleteRecord(5);
        System.out.println(myBook.getAllRecords());
    }
}
