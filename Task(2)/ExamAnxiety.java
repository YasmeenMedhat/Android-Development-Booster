
package anxietyawareness;


public class ExamAnxiety extends Anxiety {
    
    String definition="It is the feeling of dread, fear and panic that some people can experience \n" +
"before or during an exam or assessment that is very difficult to tolerate.";
    String symptoms="-Sweating\n" +
"-Shaking\n" +
"-Increased breathing\n" +
"-Fainting\n" +
"-Feeling sick\n" +
"-Butterflies in the stomach\n" +
"-Difficulty in concentrating\n" +
"-Panic\n" +
"-Feeling overwhelmed and hopeless";
    String advice="Exam tension is normal. Remember, a certain degree of anxiety improves our performance so that feeling of being on edge is normal and shows you're preparing for the big day. \n" +
"However, if you feel that intense fear: Prepare for the exam, eat well and sleep well in the run up to the exam, \n" +
"learn to relax, work on changing your mindset from a fear-based one to a succeeding one";
    
@Override
public String definition()
{
return definition;
}

@Override
public String displaySymptoms()
{
return symptoms;
}
@Override
public String reflectByAdvice()
{
  return advice;
}
}
