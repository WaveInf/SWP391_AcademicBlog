import { useEffect, useState } from 'react'
import './App.css'
import MovieCard from './components/movie-card';
import MovieScore from './components/movie-score';

function App() {

  //input: default value
  //outut: [0,1]
  useState();

  const [number, setNumber] = useState(1);

  const handleClick = () => {
    setNumber(number + 1);
  }
  
  const fetchAPI = () => {
    console.log("Fetching API...")
  };

  useEffect(fetchAPI, []);
    
  return (
    <>
    <MovieCard />
    <MovieScore />
    </>
  )
}

export default App
