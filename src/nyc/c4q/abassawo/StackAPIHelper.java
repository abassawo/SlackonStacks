package nyc.c4q.abassawo;


import nyc.c4q.abassawo.pojos.Channel;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


/**
 * Created by Abass on 9/15/16.
 */
public class StackAPIHelper {

    static Stack<APIService.APIMethod> slackStack;
    static APIService service = new APIService(Config.SLACK_BASE_ENDPOINT, Config.TEST_TOKEN);
    private static StackAPIHelper instance;

    public static StackAPIHelper getInstance(){
        if(instance == null){
            instance = new StackAPIHelper();
        }
        return instance;
    }

    public List<Channel> listChannels(){
        String jsonStr = service.request(APIService.APIMethod.ChannelsList);
        Js
        String[] channelnames = jsonStr.split("name\": \" " +" ");
        System.out.println(channelnames.length);
        List<Channel> channels = new ArrayList<>();
        for(String name : channelnames){
            Channel channel = new Channel(name);
            channels.add(channel);
        }
        return channels;
    }

    public void joinChatRoom(String roomName){
        APIService.APIMethod method = APIService.APIMethod.ChannelsJoin;
        String endpoint = service.getFinalEndpoint(method) + "&name="+roomName;
        service.loadJSONString(endpoint);
    }


    public static Stack<APIService.APIMethod> populateSlackMethods() {
        Stack<APIService.APIMethod> stack = new Stack();
        for (APIService.APIMethod method : APIService.APIMethod.values()) {
            stack.push(method);
        }
        return stack;
    }
}
