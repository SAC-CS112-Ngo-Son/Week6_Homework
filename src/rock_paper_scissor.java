
//Son Ngo

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.JOptionPane;

public class rock_paper_scissor
{

	public static void main(String[] args)
	{
		Random randomizer = new Random();

		//choice list
		List<String> list = new ArrayList<String>();
		list.add("ROCK");
		list.add("PAPER");
		list.add("SCISSOR");

		int reply = 0;

		do
		{
			String User = "", Comp = "";

			while ((!User.equals("ROCK")) && (!User.equals("PAPER")) && (!User.equals("SCISSOR")))
			{
				User = JOptionPane.showInputDialog("ROCK, PAPER, SCISSOR: ");
			}

			//randomize computer's choice
			Comp = list.get(randomizer.nextInt(list.size()));
			System.out.printf("%s\n", Comp);

			if (User.equals(Comp))
				reply = JOptionPane.showConfirmDialog(null, "That's a tie. Do you want to continue?", "",
						JOptionPane.YES_NO_OPTION);
			else if (((User.equals("SCISSOR")) && (Comp.equals("PAPER")))
					|| ((User.equals("PAPER")) && (Comp.equals("ROCK")))
					|| ((User.equals("ROCK")) && (Comp.equals("SCISSOR"))))
				reply = JOptionPane.showConfirmDialog(null, "You've won. Do you want to continue?", "",
						JOptionPane.YES_NO_OPTION);
			else
				reply = JOptionPane.showConfirmDialog(null, "You've lost. Do you want to continue?", "",
						JOptionPane.YES_NO_OPTION);
		} while (reply == JOptionPane.YES_OPTION);
	}
}

//Good and compact
