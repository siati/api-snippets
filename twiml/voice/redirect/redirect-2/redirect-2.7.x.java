import com.twilio.twiml.voice.Dial;
import com.twilio.twiml.voice.Redirect;
import com.twilio.twiml.VoiceResponse;
import com.twilio.twiml.TwiMLException;


public class Example {
    public static void main(String[] args) {
        Dial dial = new Dial.Builder("415-123-4567").build();
        Redirect redirect = new Redirect
            .Builder("http://www.foo.com/nextInstructions").build();
        VoiceResponse response = new VoiceResponse.Builder().dial(dial)
            .redirect(redirect).build();

        try {
            System.out.println(response.toXml());
        } catch (TwiMLException e) {
            e.printStackTrace();
        }
    }
}
