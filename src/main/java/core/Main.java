package core;

import javax.security.auth.login.LoginException;

import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.OnlineStatus;
import util.Secrets;

public class Main {
	
	private static JDABuilder jdaBuilder;
    private static JDA jda;
	
	public static void main(String[] Args) {
		
		setup();
			
	}
	
	
	public static void setup() {
		
		setJdaBuilder(new JDABuilder(AccountType.BOT));
		setBotSettings();
		buildBlocking();
		addListeners();
		addCommands();
	}
	
	private static JDABuilder getJdaBuilder() {
        return jdaBuilder;
    }
	
	private static void setBotSettings() {
        getJdaBuilder().setToken(Secrets.TOKEN);
        getJdaBuilder().setAutoReconnect(true);
        getJdaBuilder().setStatus(OnlineStatus.ONLINE);
		
	}
	
	private static void addListeners() {
		
	}
	
	private static void addCommands() {
		
	}
	
	private static void buildBlocking() {
        try {
            setJda(getJdaBuilder().buildBlocking());
        } catch (LoginException | InterruptedException e) {
            e.printStackTrace();
        }
    }
	
	private static void setJda(JDA jda) {
        Main.jda = jda;
    }
	
	private static void setJdaBuilder(JDABuilder jdaBuilder) {
        Main.jdaBuilder = jdaBuilder;
    }
}
