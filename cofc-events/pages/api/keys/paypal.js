import { getSession } from 'next-auth/react';

const handler = async (req, res) => {
  const session = await getSession({ req });
  if (!session) {
    return res.status(401).send('signin required');
  }
  res.send(
    'AdXEj82g0gv9mhkQoulsEVg0XYr6GOZbSSBLDad2BMOWxvdpFFB9BFmRTtaLOKZqv9OimXfiB1C5w9-D' ||
      'sb'
  );
};
export default handler;
