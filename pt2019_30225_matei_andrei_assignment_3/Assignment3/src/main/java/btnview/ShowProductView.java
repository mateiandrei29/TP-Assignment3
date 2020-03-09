package btnview;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;

import operations.ProductOperations;

public class ShowProductView  extends JFrame{
	public ShowProductView(){
		  //headers for the table
        String[] columns = new String[] {
            "Id", "Nume", "Cantitate", "Pret"
        };
         ProductOperations productop=new ProductOperations();
        //actual data for the table in a 2d array
         int noProducts=productop.noProducts();
        Object[][] data = new Object[noProducts][5]; 
        //create table with data
        for(int i=0;i<noProducts;i++)
        {
        	int j=0;
        	data[i][j]=i;
        	data[i][j+1]=productop.printName(i+1);
        	data[i][j+2]=productop.printQt(i+1); 
        	data[i][j+3]=productop.printPret(i+1);
        	

        	
        }
        JTable table = new JTable(data, columns);
         
        //add the table to the frame
        this.add(new JScrollPane(table));
         
        this.setTitle("Table Example");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
        this.pack();
        this.setVisible(true);
    }
}
