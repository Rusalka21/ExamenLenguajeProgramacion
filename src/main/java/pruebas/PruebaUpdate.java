package pruebas;

import java.util.List;

import daos.SubjectDao;
import daos.SubjectDaoImpl;
import model.Subject;

public class PruebaUpdate {

	public static void main(String[] args) {

		SubjectDao dao = new SubjectDaoImpl();
		
		Subject subject = new Subject();
		
		subject.setIdsubject(4);
		subject.setSubject("Gestion de Servicios TI");
		subject.setCredits("3");
		
		dao.update(subject);
		
		List<Subject> subjectList = dao.findAll();
		
		for(Subject r: subjectList) {
			System.out.println(r.getIdsubject());
			System.out.println(r.getSubject());
			System.out.println(r.getCredits());
		}
	}
}
