import {Component, Fragment} from "react";
import Image from "../../components/Home/imageCard";
import {withStyles} from "@mui/styles";
import {styleSheet} from "../CustomerForm/style";
import Grid from '@mui/material/Grid';
import Typography from '@mui/material/Typography';
import TextField from '@mui/material/TextField';
import Button from "@mui/material/Button";

class Customer extends Component{

    constructor(props) {
        super(props);
    }

    render() {

        const {classes} = this.props;

        return(
            <div className={classes.container}>
                <Image/>
                <div className={classes.title_container}>
                    <h1>Customer Registration</h1>
                </div>
                <div className={classes.form_container}>
                    <div>
                        <Typography variant="body2" gutterBottom>Customer ID</Typography>
                        <TextField id="outlined-basic" placeHolder="customerID" label="Customer ID" variant="outlined" size="small" style={{width:'100% / 2 - 20px'}}/>
                    </div>
                    <div>
                        <Typography variant="body2" gutterBottom>Customer Name</Typography>
                        <TextField id="outlined-basic" placeHolder="customerName" label="Customer Name" variant="outlined" size="small" style={{width:'100% / 2 - 20px'}}/>
                    </div>
                    <div>
                        <Typography variant="body2" gutterBottom>Customer Address</Typography>
                        <TextField id="outlined-basic" placeHolder="customerAddress" label="Customer Address" variant="outlined" size="small" style={{width:'100% / 2 - 20px'}}/>
                    </div>
                    <div>
                        <Typography variant="body2" gutterBottom>Contact</Typography>
                        <TextField id="outlined-basic" placeHolder="contactNo" label="Contact" variant="outlined" size="small" style={{width:'100% / 2 - 20px'}}/>
                    </div>
                    <div>
                        <Typography variant="body2" gutterBottom>Driving License</Typography>
                        <TextField id="outlined-basic" placeHolder="License" label="Driving License" variant="outlined" size="small" style={{width:'100% / 2 - 20px'}}/>
                    </div>
                    <div>
                        <Typography variant="body2" gutterBottom>Identity Card</Typography>
                        <TextField id="outlined-basic" placeHolder="NIC No" label="NIC Card" variant="outlined" size="small" style={{width:'100% / 2 - 20px'}}/>
                    </div>
                    <div className={classes.btn_container}>
                        <Button variant="contained">Register</Button>
                    </div>
                </div>
            </div>
            /*<Fragment>
                <Image/>
                <h1>Customer Registration</h1>
                <Grid container spacing={0.5} className={classes.container}>
                    <Grid item lg={6} md={6} sm={6} xm={6}>
                        <Typography variant="body2" gutterBottom>Customer ID</Typography>
                        <TextField id="outlined-basic" placeHolder="customerID" label="Customer ID" variant="outlined" size="small" style={{width:'100%'}}/>
                    </Grid>
                    <Grid item lg={6} md={6} sm={6} xm={6}>
                        <Typography variant="body2" gutterBottom>Customer Name</Typography>
                        <TextField id="outlined-basic" placeHolder="customerName" label="Customer Name" variant="outlined" size="small" style={{width:'100%'}}/>
                    </Grid>
                    <Grid item lg={6} md={6} sm={6} xm={6}>
                        <Typography variant="body2" gutterBottom>Customer Address</Typography>
                        <TextField id="outlined-basic" placeHolder="customerAddress" label="Customer Address" variant="outlined" size="small" style={{width:'100%'}}/>
                    </Grid>
                    <Grid item lg={6} md={6} sm={6} xm={6}>
                        <Typography variant="body2" gutterBottom>Contact</Typography>
                        <TextField id="outlined-basic" placeHolder="contactNo" label="Contact" variant="outlined" size="small" style={{width:'100%'}}/>
                    </Grid>
                    <Grid item lg={6} md={6} sm={6} xm={6}>
                        <Typography variant="body2" gutterBottom>Driving License</Typography>
                        <TextField id="outlined-basic" placeHolder="License" label="Driving License" variant="outlined" size="small" style={{width:'100%'}}/>
                    </Grid>
                    <Grid item lg={6} md={6} sm={6} xm={6}>
                        <Typography variant="body2" gutterBottom>Identity Card</Typography>
                        <TextField id="outlined-basic" placeHolder="NIC No" label="NIC Card" variant="outlined" size="small" style={{width:'100%'}}/>
                    </Grid>
                    <Grid item lg={6} md={6} sm={6} xm={6} style={{display:'flex'}} justifyContent={"flex-end"}>
                        <Button variant="contained">Register</Button>
                    </Grid>
                </Grid>
            </Fragment>*/
        )
    }
}

export default withStyles(styleSheet) (Customer)