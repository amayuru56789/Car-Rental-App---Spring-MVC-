import { Component } from "react";
import { withStyles } from "@mui/styles";
import { styleSheet } from "./style";
import Button from '@mui/material/Button';

class Header extends Component{
    constructor(props){
        super(props);
    }

    render(){

        const {classes} = this.props;

        return(
            <header className={classes.container}>
                <h1>AVC Car Rental</h1>
                <div className={classes.btn}> 
                    <Button variant="outlined">Sign In</Button>
                </div>
            </header>
        )
    }
}

export default withStyles(styleSheet) (Header)