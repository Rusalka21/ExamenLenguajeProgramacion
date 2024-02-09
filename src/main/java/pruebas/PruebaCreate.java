package pruebas;

import java.util.List;

import daos.SubjectDao;
import daos.SubjectDaoImpl;
import model.Subject;

public class PruebaCreate {

	public static void main(String[] args) {

		SubjectDao dao = new SubjectDaoImpl();
		
		Subject subject = new Subject();
		
		subject.setSubject("Base de Datos Avanzado II");
		subject.setCredits("4");
		
		dao.create(subject);
		
		List<Subject> subjectList = dao.findAll();
		
		for(Subject r: subjectList) {
			System.out.println(r.getIdsubject());
			System.out.println(r.getSubject());
			System.out.println(r.getCredits());
		}
	}
}
