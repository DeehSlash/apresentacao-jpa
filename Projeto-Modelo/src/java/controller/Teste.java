package controller;

import dao.DAO;
import dominio.Marca;
import dominio.Veiculo;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Teste", urlPatterns = {"/Teste"})
public class Teste extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        Marca marca = new Marca();
        DAO dao = new DAO<Veiculo>();
        
        Veiculo veiculo = new Veiculo();
        veiculo.setAno(1965);
        marca.setNome("Fiat");
        veiculo.setMarca(marca);
        veiculo.setPlaca("kkk-kk8");
        veiculo.setNome("PALIO");
        dao.inserir_atualizar(veiculo);
        
        veiculo.setAno(1980);
        marca.setNome("Peugeot");
        veiculo.setMarca(marca);
        veiculo.setPlaca("YYY-AAA");
        veiculo.setNome("307");
        dao.inserir_atualizar(veiculo);
                
        veiculo.setAno(1999);
        marca.setNome("Ford");
        veiculo.setMarca(marca);
        veiculo.setPlaca("yyy-bbb");
        veiculo.setNome("Focus");
        dao.inserir_atualizar(veiculo);
        
        veiculo.setAno(2010);
        marca.setNome("Hyundai");
        veiculo.setMarca(marca);
        veiculo.setPlaca("www-bbb");
        veiculo.setNome("HB20");
        dao.inserir_atualizar(veiculo);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
