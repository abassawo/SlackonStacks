package nyc.c4q.abassawo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by Abass on 9/15/16.
 */
public class APIService {
    private String baseEndpoint, token;

    public APIService(String baseEndpoint, String token){
        this.baseEndpoint = baseEndpoint;
        this.token = token;
    }

    public String request(APIMethod method){
        String endpoint = getFinalEndpoint(method);
        return loadJSONString(endpoint);
    }


    public String loadJSONString(String endpoint){
        try {
            URL slackEndpoint = new URL(endpoint);
            URLConnection connection = slackEndpoint.openConnection();
            InputStreamReader isr = new InputStreamReader(connection.getInputStream());
            BufferedReader buffer = new BufferedReader(isr);
            StringBuilder stringBuilder = new StringBuilder();
            String line;
            while((line = buffer.readLine()) != null){
                stringBuilder.append(line);
//                System.out.println(line);
            }
            buffer.close();
            return stringBuilder.toString();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String getFinalEndpoint(APIMethod method){
        String append = "";

        switch (method){
            case Test:append = "api.test";
                break;
            case BotsInfo: append = "bots.info";
                break;
            case ChannelsCreate: append = "channels.creatte";
                break;
            case ChannelsArchive: append = "channels.archive";
                break;
            case ChannelsHistory: append = "channels.history";
                break;
            case ChannelsInfo: append = "channels.info";
                break;
            case ChannelsJoin: append = "channels.join";
                break;
            case ChannelsList: append = "channels.list";
                break;
            case EmojiList: append = "emojis.list";
                break;
            default: append = "api.test";
                break;
        }
        return baseEndpoint + append + "?token="+ token;
    }


    public enum APIMethod{
        Test, AuthTest, BotsInfo, ChannelsArchive, ChannelsCreate, ChannelsHistory,
        ChannelsInfo, ChannelsJoin, ChannelsLeave, ChannelsList, EmojiList
    }

}
