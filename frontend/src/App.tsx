import './App.css'
import ReactDOM from "react-dom/client";
import { BrowserRouter, Routes, Route } from "react-router-dom";

const App = () => {
    return (
        <BrowserRouter>
        <Routes>
            <Route path="/" element={<div><h1>Hello</h1></div>}/>
        </Routes>
        </BrowserRouter>
    );
}

export default App
