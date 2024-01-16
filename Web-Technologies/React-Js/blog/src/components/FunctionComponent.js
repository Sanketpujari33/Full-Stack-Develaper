function FunctionComponent() {
    return (
        <>
            <h1>Function Component</h1>
            <User />
        </>
    );
}
function User() {
    function Appale(){
        return (
            <>
                <h1>Inner Function Component </h1>
            </>
        );
    }
    return (
        <>
            <h1>User Component</h1>
            {<Appale/>}
        </>
    );
}
export default FunctionComponent;