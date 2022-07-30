import { Component } from "react";
import Image from "../../components/Home/imageCard";
import { withStyles } from "@mui/styles";
import {styleSheet} from "./style";
import { Swiper, SwiperSlide } from 'swiper/react';
import 'swiper/css';
import 'swiper/css/navigation';
import 'swiper/css/pagination';
import 'swiper/css/scrollbar';
import SwiperCore, { Navigation, Pagination, Scrollbar, A11y } from 'swiper';
import car1 from "../../assets/img/car-1.png";
import car2 from "../../assets/img/car-2.png";
import car3 from "../../assets/img/car-3.png";
import car4 from "../../assets/img/car-4.png";
import car5 from "../../assets/img/car-5.png";
import car6 from "../../assets/img/car-6.png";
import car7 from "../../assets/img/car-7.png";
import car8 from "../../assets/img/car-8.png";
import v1 from "../../assets/img/vehicle-1.png";
import v2 from "../../assets/img/vehicle-2.png";
import v3 from "../../assets/img/vehicle-3.png";
import v4 from "../../assets/img/vehicle-4.png";
import {sliderClasses} from "@mui/material";

class Dash extends Component{
    constructor(props){
        super(props);
    }

    render(){

        const {classes} = this.props;

        SwiperCore.use([Navigation, Pagination, Scrollbar, A11y]);

        const data = [
            {
              id:1,
              username:'Mercedes',
              testimonial:<img src={car1} alt=""/>,
            },
            {
                id:2,
                username:'KWID',
                testimonial:<img src={car2} alt=""/>,
            },
            {
                id:3,
                username:'Alexander',
                testimonial:<img src={car3} alt=""/>,
            },
            {
                id:4,
                username:'Audi',
                testimonial:<img src={car4} alt=""/>,
            },
            {
                id:5,
                username:'Sportage',
                testimonial:<img src={car5} alt=""/>,
            },
            {
                id:5,
                username:'Honda',
                testimonial:<img src={car6} alt=""/>,
            }
        ]

        return(
            <div className={classes.container}>
                <h1 className={classes.h1}>FIND YOUR CAR</h1>
                 <Image/>
                {/* <Header/> */}
                <div className={classes.carDiv}>
                    <Swiper
                        spaceBetween={50}
                        slidesPerView={3}
                        navigation
                        pagination={{ clickable: true }}
                        scrollbar={{ draggable: true }}
                        onSlideChange={() => console.log('slide change')}
                        onSwiper={(swiper) => console.log(swiper)}

                    >
                        {/*<SwiperSlide>Slide 1</SwiperSlide>*/}
                        {/*<SwiperSlide>Slide 2</SwiperSlide>*/}
                        {/*<SwiperSlide>Slide 3</SwiperSlide>*/}
                        {/*<SwiperSlide>Slide 4</SwiperSlide>*/}
                        {/*...*/}
                        {
                            data.map(user=>(
                                <SwiperSlide key={user.id} className={sliderClasses}>
                                    {/*<div>{user.testimonial}</div>*/}
                                    <div>
                                        <h5>{user.username}</h5>
                                        <div>
                                            <div>{user.testimonial}</div>
                                        </div>

                                    </div>
                                </SwiperSlide>
                            ))
                        }
                    </Swiper>
                </div>

                {/*<div className={classes.container}>*/}
                {/*    /!*<div className={classes.carDiv}>s</div>*!/*/}
                {/*    /!*<div className={classes.carDiv}>s</div>*!/*/}
                {/*    /!*<div className={classes.carDiv}>s</div>*!/*/}
                {/*    /!*<div className={classes.carDiv}>s</div>*!/*/}

                {/*    /!*<Swiper*/}
                {/*        spaceBetween={50}*/}
                {/*        slidesPerView={3}*/}
                {/*        onSlideChange={() => console.log('slide change')}*/}
                {/*        onSwiper={(swiper) => console.log(swiper)}*/}
                {/*    >*/}
                {/*        <SwiperSlide>Slide 1</SwiperSlide>*/}
                {/*        <SwiperSlide>Slide 2</SwiperSlide>*/}
                {/*        <SwiperSlide>Slide 3</SwiperSlide>*/}
                {/*        <SwiperSlide>Slide 4</SwiperSlide>*/}
                {/*        ...*/}
                {/*    </Swiper>*!/*/}
                {/*</div>*/}
            </div>
        )
    }
}

export default withStyles(styleSheet) (Dash)