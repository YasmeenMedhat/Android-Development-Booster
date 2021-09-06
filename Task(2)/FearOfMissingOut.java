
package anxietyawareness;

public class FearOfMissingOut extends Anxiety {
    
    String definition="FOMO is an anxiety about missing out. Alternatively, it's about others having a better time than you,\n" +
"primarily derived from information on social media";
    String symptoms="-Always trying to keep connected with what others are doing\n" +
"-Very frequent checking of social media and other social information\n" +
"-Continous fear of missing out or being left out\n" +
"-Unhappiness over what is seen as other people's happiness\n" +
"-Over-focus on social status";
    String advice="-Remember what's on social media is the best representation of what people want to present of themselves. \n" +
"-Try your best to not compare, focus on what you do have and be appreciative. \n" +
"-Look out for the good things you have that you may have taken for granted. \n" +
"-Identify what you might be sad about and see if you can make change. \n" +
"-Identify areas of low self esteem and work on improving these.";
    
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
