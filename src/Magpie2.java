/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 * 		    Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie2
{
	/**
	 * Get a default greeting 	
	 * @return a greeting
	 */
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}
	
	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
    public String getResponse(String statement)
    {
        String response = "";
        if (statement.trim().contains("no"))
        {
            response = "Why so negative?";
        }
        else if (statement.indexOf("mother")>=1
                || statement.indexOf("father")>=1
                || statement.indexOf("sister")>=1
                || statement.indexOf("brother")>=1)
        {
            response = "Tell me more about your family.";
        }
        else if (statement.indexOf("cat")>=1
                || statement.indexOf("sports")>=1)
        {
            response = "Tell me more about your pets.";
        }
        else if (statement.indexOf("Mr. Tanczos")>=1)
        {
            response = "He sounds like a good teacher.";
        }
        else if (statement.trim().length() == 0)
        {
            response = "Say something, please.";
        }
        else if(statement.indexOf("sports")>=1)
        {
            response = "I like sports too!";
        }
        else if(statement.indexOf("video games")>=1)
        {
            response = "What is your favorite genre?";
        }
        else if(statement.indexOf("food")>=1)
        {
            response = "I'm hungry.";
        }
        else
        {
            response = getRandomResponse();
        }
        return response;
    }



    private String getRandomResponse()
    {
        final int NUMBER_OF_RESPONSES = 6;
        double r = Math.random();
        int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
        String response = "";

        if (whichResponse == 0)
        {
            response = "Interesting, tell me more.";
        }
        else if (whichResponse == 1)
        {
            response = "Hmmm.";
        }
        else if (whichResponse == 2)
        {
            response = "Do you really think so?";
        }
        else if (whichResponse == 3)
        {
            response = "You don't say.";
        }
        else if (whichResponse == 4)
        {
            response = "Do you like Batman?";
        }
        else if (whichResponse == 5)
        {
            response = "How fascinating!";
        }

        return response;
    }
}
