package fr.meg.project.web;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import fr.meg.project.model.Client;
import fr.meg.project.model.Entree;

public class IndexServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/views/index.jsp").forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		Client client = new Client() ; 
		Entree entree = new Entree() ; 
		client.setCiv(Integer.parseInt(request.getParameter("civility")));
		client.setNum( Integer.parseInt( request.getParameter("numeroClient") ) );
		client.setAgence( Integer.parseInt( request.getParameter("numeroAgence") ) );
		client.setNom( request.getParameter("famillyName") );
		client.setPrenom( request.getParameter("firstName") );
		client.setAdr_11( request.getParameter("mainAdress") );
		client.setAdr_12(request.getParameter("complementAdress1"));
		client.setAdr_13(request.getParameter("complementAdress2"));
		client.setCp(request.getParameter("postalCode")) ;
		client.setVille(request.getParameter("city"));
		entree.setType(request.getParameter("transactionType"));
		entree.setMontant(Double.parseDouble(request.getParameter("transactionAmount")));
		entree.setDate(request.getParameter("date"));
		entree.setSoldeActuel(Double.parseDouble(request.getParameter("soldeActuel")));
		entree.setSoldeActuel(Double.parseDouble(request.getParameter("soldeAncien")));
		entree.setDescription(request.getParameter("comment"));
		client.getReleve().add(entree) ;

		try {
			
			JAXBContext jaxbContext = JAXBContext.newInstance(Client.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
			
			File dataFile = new File("C:\\Users\\Nadir\\Desktop\\test.xml");
			
			
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			jaxbMarshaller.marshal(client, dataFile);
			
		} catch (JAXBException e) {
          e.printStackTrace();
		}
		
		response.sendRedirect(this.getServletContext().getContextPath() + "/customer");
	}

}
