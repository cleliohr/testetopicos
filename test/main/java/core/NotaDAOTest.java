package core;

import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;
import model.Nota;

public class NotaDAOTest extends TestCase{
	
	Nota n1 = new Nota();
	Nota n2 = new Nota();
	Nota n3 = new Nota();
	INotasDAO notaDAO;
	
	
	@Before
	public void prepararAmbiente(){
		
		n1.setId(1L);
		n1.setDescricao("Nota1");
		
		n2.setId(2L);
		n2.setDescricao("Nota2");
		
		n3.setId(3L);
		n3.setDescricao("Nota3");
		
	}
	
	@Test
	public void testInsert(){
		assertEquals(n1, notaDAO.save(n1));
		assertEquals(n2, notaDAO.save(n2));
		assertEquals(n3, notaDAO.save(n3));
	}
	
	@Test
	public void testFind(){
		assertEquals(n1, notaDAO.findById(n1.getId()));
		assertEquals(n2, notaDAO.findById(n2.getId()));
		assertEquals(n3, notaDAO.findById(n3.getId()));
	}
	
	@Test
	public void testDelete(){
		notaDAO.delete(n1);
		notaDAO.delete(n2);
		notaDAO.delete(n3);
		
		assertEquals(null, notaDAO.findById(n1.getId()));
		assertEquals(null, notaDAO.findById(n2.getId()));
		assertEquals(null, notaDAO.findById(n3.getId()));
	}
	
	
}
