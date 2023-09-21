import React from "react";
import { Progress } from "antd";
import "./index.scss";

function MovieScore(){
    return (
        <Progress type="cirlce" percent={75} size={"small"}></Progress>
      )
}

export default MovieScore;