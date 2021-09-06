
package anxietyawareness;


public class OCD extends Anxiety {
    String definition="Because Anxiety makes people afraid, they fall into a pattern of checking things to feel safe. \n" +
"When this pattern becomes repetitive or connected with obsessions a person may have, \n" +
"they may develop a disorder called Obsessive Compulsive Disorder (OCD)";
    String symptoms="-Many fears (germs, intrusive thoughts, or images)\n" +
"-Repeating behaviors or rituals, repeating thoughts.\n" +
"-Excessive checking\n" +
"-Not being able to tolerate anything that isn't perfect or done right\n" +
"-Fear of bad things happening if not prevented by a ritual or routine";
    String advice="Exposing yourself to the fear and resisting or delaying the urge to complete a compulsive ritual helps to gain control";
    
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
