import { Component } from "react";
class Login extends Component{
    constructor(props){
        super(props);
    }

    render(){

        const {classes} = this.props;

        return(
            <div className="class.container">
                <h1>Login page</h1>
                {/* <Image/> */}
                {/* <Header/> */}
            </div>
        )
    }
}

export default Login