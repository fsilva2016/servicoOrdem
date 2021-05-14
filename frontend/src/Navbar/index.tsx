import './styles.css';
import { ReactComponent as Logo } from './logo.svg';
import { Link } from 'react-router-dom';

function NavBar() {
    return (
        <header className="top_menu">
            <div className="container">
                <div className="sub_menu">
                    <span>
                        <strong>Usuário:</strong>
                        <span className="colaborador">Admin_Admin</span>
                    </span>
                    <a className="logoff" href="index.html"><i className="fas fa-sign-in-alt"></i> Sair</a
                    >
                </div>
            </div>
        </header>
    )
}

export default NavBar;