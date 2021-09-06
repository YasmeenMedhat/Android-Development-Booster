
package anxietyawareness;

public class GeneralizedAnxiety extends Anxiety {

String definition="This is when someone feels anxious and worried most of the time, over lots of different things.";    
String symptoms= "-Heart beating faster\n" +
"-Chest tightness\n" +
"-Stomach problems\n" +
"-Sweaty palms\n" +
"-Difficulty sleeping\n" +
"-Difficulty eating";
String advice="Learn to calm and manage the physical symptoms of anxiety and free yourself of worry. Think about what do you need help with? Is it dealing with your emotions? managing your worries? reacting to them? managing physical responses to Anxiety?";

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