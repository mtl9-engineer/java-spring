public class Main {
    public static void main(String[] args) {
        FirstNonSealedClass firstNonSealedClass = new OtherClass();
        FirstSealedClass firstSealedClass = new FirstNonSealedClass();
        FirstSealedClass firstSealedClass1 = new FinalClass();
    }
}
