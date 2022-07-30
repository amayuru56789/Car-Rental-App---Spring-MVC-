import { Component } from "react";
import Typography from '@mui/material/Typography';
import { withStyles } from "@mui/styles";
import { styleSheet } from "./style";
import template from "../../../assets/img/landscape.jpg";
import Button from '@mui/material/Button';

class Image extends Component{
    constructor(props){
        super(props);
    }

    render(){

        const {classes} = this.props;

        return(
            <div className={classes.container}>
                {/*<div className={classes.title}>
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
                </div>*/}
                
                    <img src={template} alt="" className={classes.container}/>
                
            </div>
        )

    }
}

export default withStyles(styleSheet) (Image)