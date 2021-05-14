import './styles.css';
import { Link } from 'react-router-dom';
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome';


function Painel() {
    return (
        <>
            <section className="container">

                <div className="row">
                    <div className=" menu col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12">
                        <div className="menu_sub ">
                            <FontAwesomeIcon icon={['fas', 'coffee']} />
                            <Link to="/cadastro_produtos">

                                <p>Cadastro Produto</p>
                            </Link>
                        </div>
                        <div className="menu_sub ">
                            <a href="">
                                <i className="fas fa-car"></i>
                                <p>Cadastro Clientes</p>
                            </a>
                        </div>
                        <div className="menu_sub ">
                            <a href="">
                                <i className="far fa-address-book"></i>
                                <p>Cadastro Fornecedor</p>
                            </a>
                        </div>
                        <div className="menu_sub ">
                            <a href="">
                                <i className="fas fa-users"></i>
                                <p>Cadastro colaborador</p>
                            </a>
                        </div>
                        <div className="menu_sub ">
                            <a href="">
                                <i className="fas fa-cash-register"></i>
                                <p> PDV Vendas</p>
                            </a>
                        </div>
                    </div>
                </div>

            </section>
        </>
    )
}

export default Painel;