package tr.com.selcuk.dal;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import tr.com.selcuk.core.ObjectHelper;
import tr.com.selcuk.interfaces.IDataAccessLayer;
import tr.com.selcuk.type.CustomerContract;

public class CustomerDal extends ObjectHelper implements IDataAccessLayer<CustomerContract>{

	@Override
	public void insert(CustomerContract contract) {
	Connection connection=getConnection();
	try {
		Statement statement =connection.createStatement();
        statement.executeUpdate("INSERT customer (adi,soyadi) VALUES('"+contract.getName()+"','"+contract.getSurname()+"')");
        
        statement.close();
        connection.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
		
	}

	@Override
	public void update(CustomerContract contract) {
	
		Connection connection=getConnection();
		try {
			Statement statement =connection.createStatement();
	        statement.executeUpdate("UPDATE customer SET adi='"+contract.getName()+"',soyadi='"+contract.getSurname()+"'WHERE id= "+contract.getId());
	        
	        statement.close();
	        connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	@Override
	public void delete(CustomerContract contract) {

		Connection connection=getConnection();
		try {
			Statement statement =connection.createStatement();
	        statement.executeUpdate("DELETE FROM customer WHERE id="+contract.getId());
	        
	        statement.close();
	        connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

	@Override
	public List<CustomerContract> getList() {
List<CustomerContract> dataContract=new ArrayList<CustomerContract>();
Connection connection=getConnection();

try {
	Statement statement=connection.createStatement();
	ResultSet rs=statement.executeQuery("SELECT *FROM customer");
	while(rs.next()) {
		CustomerContract contract=new CustomerContract();
	contract.setId(rs.getInt("id"));
	contract.setName(rs.getString("adi"));
	contract.setSurname(rs.getString("soyadi"));
	dataContract.add(contract);
	
	
	}
	statement.close();
	connection.close();
	
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}


		return dataContract;
	}

	@Override
	public CustomerContract getById(int id) {
CustomerContract contract =new CustomerContract();
Connection connection =getConnection();
try {
	Statement statement =connection.createStatement();
	ResultSet rs=statement.executeQuery("SELECT * FROM customer WHERE id="+id);
while(rs.next()) {
	contract.setId(rs.getInt("id"));
	contract.setName(rs.getString("adi"));
	contract.setSurname(rs.getString("soyadi"));
}

statement.close();
connection.close();

} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
		
		return contract;
	}
	
	public List<CustomerContract> getSearch(String name){
		
		List<CustomerContract> dataConract =new ArrayList<CustomerContract>();
		Connection connection =getConnection();
		try {
			Statement statement =connection.createStatement();
		ResultSet rs=statement.executeQuery("SELECT *FROM customer WHERE adi LIKE '%"+name+"%'" );
		
		
		while(rs.next()) {
			CustomerContract contract =new CustomerContract();
			contract.setId(rs.getInt("id"));
			contract.setName(rs.getString("adi"));
			contract.setSurname(rs.getString("soyadi"));
		
			dataConract.add(contract);
			
			
		}

		statement.close();
		connection.close();

		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		return dataConract;
				
		
	}

}
