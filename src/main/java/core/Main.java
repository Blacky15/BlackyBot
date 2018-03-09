package core;

import javax.security.auth.login.LoginException;

import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.OnlineStatus;
import util.Secrets;

public class Main {
	
	public static void main(String[] Args) {
		
		JDABuilder builder = new JDABuilder(AccountType.BOT);
		
		builder.setToken(Secrets.TOKEN);
		builder.setAutoReconnect(true);
		
		builder.setStatus(OnlineStatus.ONLINE);
		
		try {
			JDA jda = builder.buildBlocking();
		} catch (LoginException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
