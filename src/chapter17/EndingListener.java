package chapter17;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class EndingListener implements ActionListener {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		System.exit(0);
		
	}

	
}