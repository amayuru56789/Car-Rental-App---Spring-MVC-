import { Component } from "react";
// import template from "../../assets/img/landscape.jpg";
import { withStyles } from "@mui/styles";
import { styleSheet } from "./style";
import Image from "../../components/Home/imageCard";
import Header from "../../components/Home/Header";
import Dash from "../DashBoard/index";
import Customer from "../CustomerForm";
import Typography from "@mui/material/Typography";
import Button from "@mui/material/Button";

class HomePage extends Component{
    constructor(props){
        super(props);
    }

    render(){

        const {classes} = this.props;

        return(
            <div className={classes.container}>
                {/* <h1>Home Page</h1> */}
                <div className={classes.title}>
                    <h1 className={classes.h1}>BOOK A CAR NOW</h1>
                    <Typography variant="h3" gutterBottom component="div">
                        FAST & AFFORDABLE
                    </Typography>
                </div>

                <div className={classes.div}>
                    <h1 className={classes.innerTxt}>Rent a Car Now!</h1>
                    <div>
                        <Button variant="contained">CAR MODEL</Button>
                    </div>
                </div>
                <Image/>
                <Header/>
                <Dash/>
                <Customer/>
            </div>
        )
    }
}

export default withStyles(styleSheet) (HomePage)
// export default HomePage