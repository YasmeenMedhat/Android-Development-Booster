
package anxietyawareness;


public class SocialAnxiety extends Anxiety {
    
    String definition="One of the most common phobias experienced by young people. \n" +
"It is an intense fear of being judged, or noticed, or evaluated, or embarrased.";
    String symptoms="-Avoidance of being with people\n" +
"-Avoidance of performing infront of others\n" +
"-Intense fear of being judged, noticed, evaluated, or embarrased.";
    String advice="Learn to change  your thought patterns and learn to calm and face your fear, either bit by bit or in one big go.";
    
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
