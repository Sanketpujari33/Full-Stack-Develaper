import React from "react";
import GetSnapshotBeforeUpdate from "./GetSnapshotBeforeUpdate";
// import ComponentWillUnmount from "./ComponentWillUnmount";
// import { ComponentDidMount } from "./ComponentDidMount";
// import { CunstructorLifeCycle } from './CunstructorLifeCycle';
// import { RenderLifeCyle } from "./RenderLifeCyle";

function LifeCycleMethod() {
    //   const [name, setName] = useState("Sanket");
    return (
        <div style={{ margin: 10, padding: 10, backgroundColor: "darksalmon" }}>
            <h1>LifeCycle Method</h1>
        {/*<CunstructorLifeCycle/>
        <RenderLifeCyle name={name} />
        <button onClick={() => setName("SanketPujari")}>Update Name</button>
        <ComponentDidMount/>
        <ComponentDidUpdate/>
        <ShouldComponentUpdate/>
        <ComponentWillUnmount/>*/}
        <GetSnapshotBeforeUpdate/>
        </div>
    );
}
export default LifeCycleMethod;