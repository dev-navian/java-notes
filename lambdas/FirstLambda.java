package lambdas;

interface SpeakUp {
    void speak();
}

public class FirstLambda {
    SpeakUp speakLambda = () -> System.out.println("Females like to speak fast");


}
