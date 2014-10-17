import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.RowLayout	;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;


public class HelloWorldSWT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display display = new Display();
		Shell shell = new Shell(display);
		shell.setText("Hello World!");
		
		//FillLayout fillLayout = new FillLayout(SWT.HORIZONTAL);
		
		// Width of horizontal margins placed along the left and right edges
		// fillLayout.marginWidth = 5;
		// Height of Vertical margins place along the top and bottom edges
		// fillLayout.marginHeight = 5;
		
		shell.setLayout(new RowLayout());
		
		Button buttonHello = new Button(shell, SWT.PUSH);
		buttonHello.setText("Hello There");
		
		shell.setSize(450, 100);
		
		shell.open();
		
		while(!shell.isDisposed()) {
			if(!display.readAndDispatch())
				display.sleep();
		}
		display.dispose();
	}

}
