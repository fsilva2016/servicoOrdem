import { BrowserRouter, Switch, Route } from "react-router-dom";
import Painel from "./Painel";
import NavBar from "./Navbar";
import Orders from "./Orders";
import Produto from "./Produto";

function Routes() {
    return (
        <BrowserRouter>
            <NavBar />
            <Switch>
                <Route path="/orders">
                    <Orders />
                </Route>
                <Route path="/painel">
                    <Painel />
                </Route>
                <Route path="/cadastro_produtos">
                    <Produto />
                </Route>
            </Switch>
        </BrowserRouter>
    )
}

export default Routes;