import './styles.css';
import { ReactComponent as MainImage } from './main.svg';
import Footer from '../Footer';
import { faHome } from "@fortawesome/free-solid-svg-icons";
import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import { Link } from 'react-router-dom';


function Produto() {
    return (
        <>
            <section className="menu_top">
                <div className="container">
                    <ul className="menu_list">
                        <li>
                            <Link to="/painel" >
                                <FontAwesomeIcon icon={faHome} />
                                <span>Home</span>
                            </Link>

                        </li>
                        <li>
                            <a href="cadastro_produtos.html">
                                <i className="fas fa-box-open"></i>
                                <span>Cadastro Produto</span>
                            </a>
                        </li>
                        <li>
                            <a href="">
                                <i className="fas fa-car"></i>
                                <span>Cadastro Clientes</span>
                            </a>
                        </li>
                        <li>
                            <a href="">
                                <i className="far fa-address-book"></i>
                                <span>Cadastro Fornecedor</span>
                            </a>
                        </li>
                        <li>
                            <a href="">
                                <i className="fas fa-users"></i>
                                <span>Cadastro colaborador</span>
                            </a>
                        </li>
                        <li>
                            <a href="">
                                <i className="fas fa-cash-register"></i>
                                <span> PDV Vendas</span>
                            </a>
                        </li>
                    </ul>
                </div>
            </section>
            <section className="container list_produtos">
                <div className="row">
                    <div className="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12">
                        <h5 className="title">Produto cadastrados</h5>
                    </div>
                    <div className="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12">
                        <button type="button" className="btn btn-primary" data-bs-toggle="modal" data-bs-target="#exampleModal">
                            Cadastro
          </button>
                    </div>

                    <div className="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12">
                        <div>
                            <div>
                                <img src="src/img/semfoto.png" alt="" />
                            </div>
                            <div></div>
                        </div>
                    </div>
                </div>
            </section>

            <div className="modal fade" id="exampleModal" data-bs-backdrop="static" data-bs-keyboard="false" aria-labelledby="exampleModalLabel" aria-hidden="true">
                <div className="modal-dialog modal-lg">
                    <div className="modal-content">
                        <div className="modal-header">
                            <h5 className="modal-title" id="exampleModalLabel">
                                Cadastro de produtos
                            </h5>
                            <button type="button" className="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                        </div>
                        <div className="modal-body">
                            <div className="row">
                                <div className="col-xl-3 col-lg-3 col-md-3 col-sm-3 col-12">
                                    <p className="titleCadastro">Foto do produto</p>
                                    <div className="img_produto">
                                        <img src="src/img/semfoto.png" />
                                    </div>
                                    <input type="text" className="form-control" placeholder="" hidden />
                                    <button>nova imagem</button>
                                </div>
                                <div className="col-xl-9 col-lg-9 col-md-3 col-sm-3 col-12">
                                    <div className="row">
                                        <div className="col-xl-2 col-lg-3 col-md-3 col-sm-3 col-12">
                                            <p className="titleCadastro">Código </p>
                                            <input type="text" className="form-control" placeholder="100" disabled />
                                        </div>
                                        <div className="col-xl-10 col-lg-9 col-md-9 col-sm-12 col-12">
                                            <p className="titleCadastro">Produto</p>
                                            <input type="text" className="form-control" placeholder="" />
                                        </div>
                                        <div className="col-xl-3 col-lg-3 col-md-3 col-sm-3 col-12">
                                            <p className="titleCadastro">Marca</p>
                                            <select name="marca" id="marca">
                                                <option value="maraca"> Pionner</option>
                                            </select>
                                            <p>Nova Marca</p>
                                        </div>
                                        <div className="col-xl-3 col-lg-3 col-md-3 col-sm-3 col-12">
                                            <p className="titleCadastro">categoria</p>
                                            <select name="categoria" id="categoria">
                                                <option value="radio"> radio</option>
                                            </select>
                                            <p>Nova categoria</p>
                                        </div>
                                        <div className="col-xl-3 col-lg-3 col-md-3 col-sm-3 col-12">
                                            <p className="titleCadastro">Fornecedor</p>
                                            <input type="text" className="form-control" placeholder="" />
                                            <span>Novo Fornecedor</span>
                                        </div>
                                        <div className="col-xl-3 col-lg-3 col-md-3 col-sm-3 col-12">
                                            <p className="titleCadastro">Custo</p>
                                            <input type="text" className="form-control" placeholder="" />
                                        </div>
                                        <div className="col-xl-3 col-lg-3 col-md-3 col-sm-3 col-12">
                                            <p className="titleCadastro">margem produto</p>
                                            <input type="text" className="form-control" placeholder="" />
                                        </div>
                                        <div className="col-xl-3 col-lg-3 col-md-3 col-sm-3 col-12">
                                            <p className="titleCadastro">Valor de venda</p>
                                            <input type="text" className="form-control" placeholder="" />
                                        </div>
                                        <div className="col-xl-3 col-lg-3 col-md-3 col-sm-3 col-12">
                                            <p className="titleCadastro">lucro</p>
                                            <input type="text" className="form-control" placeholder="" />
                                        </div>
                                        <div className="col-xl-3 col-lg-3 col-md-3 col-sm-3 col-12">
                                            <p className="titleCadastro">estoque</p>
                                            <input type="text" className="form-control" placeholder="" />
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div className="modal-footer">
                            <button type="button" className="btn btn-secondary" data-bs-dismiss="modal">
                                Close
            </button>
                            <button type="button" className="btn btn-primary">Duplicar</button>
                            <button type="button" className="btn btn-primary">Saver</button>
                        </div>
                    </div>
                </div>
            </div>
        </>
    )
}

export default Produto;